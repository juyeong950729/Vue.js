<template>
  <h4>Acessing Props</h4>
  <p>
    name : {{ props.name }}<br />
    age : {{ props.age }}<br />
    addr : {{ props.addr }}<br />
  </p>
</template>

<script>
export default {
  name: "Component2",
  //props: ["name", "age", "addr"], // Options API (v.2 함수)
  props: {
    name: String,
    age: Number,
    addr: String,
  }, // 여기까지만 있어도 name, age, addr 선언이 된다! 왜?
  setup(props) {
    return {
      props,
    };
  },
};
</script>

<style scoped></style>
