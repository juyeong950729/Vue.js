<template>
  <h4>User1 등록</h4>
  <form @submit.prevent="modifyUser2">
    <table border="1">
      <tr>
        <td>아이디</td>
        <td><input type="text" v-model="user.uid" readonly /></td>
      </tr>
      <tr>
        <td>이름</td>
        <td><input type="text" v-model="user.name" /></td>
      </tr>
      <tr>
        <td>휴대폰</td>
        <td><input type="text" v-model="user.hp" /></td>
      </tr>
      <tr>
        <td>나이</td>
        <td><input type="number" v-model="user.age" /></td>
      </tr>
      <tr>
        <td colspan="2" align="right">
          <input type="submit" value="등록" />
        </td>
      </tr>
    </table>
  </form>
</template>
<script setup>
import axios from "axios";
import { reactive } from "vue";
import { useRouter } from "vue-router";

const router = useRouter();
const props = defineProps({
  uid: String,
  name: String,
  hp: String,
  age: Number,
});

const user = reactive({
  uid: props.uid,
  name: props.name,
  hp: props.hp,
  age: props.age,
});

const modifyUser2 = () => {
  axios
    .put("http://localhost:8080/Ch09/user2", user)
    .then((response) => {
      console.log(response);
      alert("수정완료");

      router.push("/user2/list");
    })
    .catch((error) => {
      console.log(error);
    });
};
</script>
<style scoped></style>
