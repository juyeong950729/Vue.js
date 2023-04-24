<template>
  <v-app>
    <v-app-bar>
      <v-app-bar-title>글보기</v-app-bar-title>
      <v-btn @click="btnLogout">로그아웃</v-btn>
    </v-app-bar>
    <v-main>
      <v-container>
        <v-sheet max-width="800" class="mx-auto">
          <v-text-field
            color="#111"
            label="제목"
            variant="underlined"
            readonly
          ></v-text-field>
          <v-textarea label="내용" variant="outlined" readonly></v-textarea>
          <v-file-input
            label="File input"
            variant="underlined"
            readonly
          ></v-file-input>
          <v-sheet class="text-center">
            <v-btn class="mr-2" @click="">수정</v-btn>
            <v-btn color="primary" @click="">목록</v-btn>
          </v-sheet>
        </v-sheet>
      </v-container>
    </v-main>
  </v-app>
</template>

<script setup></script>

<style scoped></style>
