<template>
  <li v-for="(todo, index) in todos">
    <i class="fa-solid fa-check" aria-hidden="true"></i>
    <span>{{ todo.content }}</span>
    <button @click="btnDelete(index, todo.id)">삭제</button>
  </li>
</template>

<script>
import { useStore } from "vuex";
import { computed } from "vue";

export default {
  name: "Item",
  setup() {
    const store = useStore();

    const todos = computed(() => store.getters.todos);

    const btnDelete = (index, id) => {
      store.dispatch("removeTodo", { index, id });
    };

    return {
      todos,
      btnDelete,
    };
  },
};
</script>

<style scoped></style>
