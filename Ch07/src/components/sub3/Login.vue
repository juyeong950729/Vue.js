<template>
  <h4>로그인</h4>
  <form @submit.prevent="loginProc">
    <table border="1">
      <tr>
        <td>아이디</td>
        <td><input type="text" v-model="user.uid" /></td>
      </tr>
      <tr>
        <td>비밀번호</td>
        <td><input type="password" v-model="user.pass" /></td>
      </tr>
      <tr>
        <td colspan="2" align="right">
          <input type="submit" value="로그인" />
        </td>
      </tr>
    </table>
  </form>
</template>
<script setup>
import { reactive } from "vue";
import { useRouter } from "vue-router";
import axios from "axios";
import { useStore } from "vuex";

const store = useStore();
const router = useRouter();

const user = reactive({
  uid: "",
  pass: "",
});

const loginProc = () => {
  store
    .dispatch("login", user)
    .then((response) => {
      console.log("1.response : " + response);
      console.log("1.nick : " + response.data.user.nick);
      router.push("/jwt/loginSuccess");
    })
    .catch((error) => {
      console.log("1.error : " + error);
    });
};
</script>
<style scoped></style>
