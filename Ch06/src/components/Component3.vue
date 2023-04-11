<template>
  <h4>Component3</h4>
  <p>
    <input type="text" v-model="no" placeholder="번호 입력" /><br />
    <input type="text" v-model="text" placeholder="할일 입력" />
  </p>
  <button @click="btnAdd">등록</button>
  <button @click="btnClear">초기화</button>
</template>

<script setup>
import { computed, ref } from "vue";
import { useStore } from "vuex";

// vuex 전역스토어 가져오기
const store = useStore();

const no = ref(0);
const text = ref("");

const btnAdd = function () {
  const data = {
    no: no.value,
    text: text.value,
    done: false,
  };

  store.dispatch("addItem", data);
};

const btnClear = function () {
  store.dispatch("clearItem");
};
</script>

<style scoped></style>
