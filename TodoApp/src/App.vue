<template>
  <!-- handler, listner 둘은 유의어 -->
  <Header v-on:addTodo="addTodoHandler"></Header>
  <Main></Main>
  <Footer></Footer>
</template>

<script>
import Header from "./components/Header.vue";
import Footer from "./components/Footer.vue";
import Main from "./components/Main.vue";
import { useStore } from "vuex";
import { onBeforeMount } from "vue";

export default {
  name: "App",
  components: {
    Header,
    Main,
    Footer,
  },
  setup() {
    const store = useStore();
    const addTodoHandler = (todo) => {
      //alert(todo);
      store.dispatch("addTodo", todo);
    };

    onBeforeMount(() => {
      store.dispatch("getTodos");
    });

    return { addTodoHandler };
  },
};
</script>

<style scoped></style>
