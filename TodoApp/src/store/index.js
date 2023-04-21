import { createStore } from "vuex";
import axios from "axios";

const store = createStore({
  state: {
    todos: [],
  },
  mutations: {
    ADD_TODO(state, todo) {
      state.todos.push(todo);
    },
    REMOVE_TODO(state, index) {
      state.todos.splice(index, 1);
    },
    CLEAR_TODO(state) {
      state.todos = [];
    },
    SET_TODOS(state, todos) {
      todos.forEach((todo, index) => {
        state.todos.push(todo);
      });
    },
  },
  actions: {
    addTodo(context, todo) {
      const params = {
        content: todo,
      };
      axios
        .post("http://localhost:8080/insert", params)
        .then((response) => {
          context.commit("ADD_TODO", todo);
        })
        .catch((error) => {
          throw error;
        });
    },
    removeTodo(context, data) {
      axios
        .delete(`http://localhost:8080/delete/${data.id}`)
        .then((response) => {
          context.commit("REMOVE_TODO", data.index);
        })
        .catch((error) => {
          throw error;
        });
    },
    clearTodo(context) {
      axios
        .delete("http://localhost:8080/clear")
        .then((response) => {
          context.commit("CLEAR_TODO");
        })
        .catch((error) => {
          throw error;
        });
    },
    getTodos(context) {
      axios
        .get("http://localhost:8080/todos")
        .then((response) => {
          const todos = response.data;
          context.commit("SET_TODOS", todos);
        })
        .catch((error) => {
          throw error;
        });
    },
  },
  getters: {
    todos(state) {
      return state.todos;
    },
  },
});

export default store;
