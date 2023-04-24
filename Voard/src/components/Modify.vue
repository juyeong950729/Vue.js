<template>
  <v-app>
    <v-app-bar>
      <v-app-bar-title>글수정</v-app-bar-title>
      <v-btn @click="btnLogout">로그아웃</v-btn>
    </v-app-bar>
    <v-main>
      <v-container>
        <v-sheet max-width="800" class="mx-auto">
          <v-text-field
            label="제목을 입력하세요"
            variant="underlined"
          ></v-text-field>
          <v-textarea label="내용을 입력하세요" variant="outlined"></v-textarea>
          <v-file-input label="File input" variant="underlined"></v-file-input>
          <v-sheet class="text-center">
            <v-btn class="mr-2" @click="">취소</v-btn>
            <v-btn color="primary" @click="">등록</v-btn>
          </v-sheet>
        </v-sheet>
      </v-container>
    </v-main>
  </v-app>
</template>

<script setup></script>

<style scoped></style>
