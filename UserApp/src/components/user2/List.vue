<template>
  <h4>User2 목록</h4>
  <table border="1">
    <tr>
      <th>아이디</th>
      <th>이름</th>
      <th>휴대폰</th>
      <th>나이</th>
      <th>관리</th>
    </tr>
    <tr v-for="user in state.users">
      <td>{{ user.uid }}</td>
      <td>{{ user.name }}</td>
      <td>{{ user.hp }}</td>
      <td>{{ user.age }}</td>
      <td>
        <a href="#" @click.prevent="modifyUser2(user)">수정</a>
        <a href="#" @click.prevent="deleteUser2(user)">삭제</a>
      </td>
    </tr>
  </table>
</template>
<script setup>
import axios from "axios";
import { useRouter } from "vue-router";
import { onBeforeMount, reactive } from "vue";

const router = useRouter();
const state = reactive({
  users: [],
});

const modifyUser2 = (user) => {
  router.push({ name: "User2Modify", params: user });
};

const deleteUser2 = (user) => {
  const result = confirm("정말 삭제?");
  if (!result) {
    return;
  }

  axios
    .delete(`http://localhost:8080/Ch09/user2/${user.uid}`)
    .then((response) => {
      console.log(response);
      state.users = response.data;
    })
    .catch((error) => {
      console.log(error);
    });
};

onBeforeMount(() => {
  axios
    .get("http://localhost:8080/Ch09/user2s")
    .then((response) => {
      console.log(response);
      state.users = response.data;
    })
    .catch((error) => {
      console.log(error);
    });
});
</script>

<style scoped></style>
