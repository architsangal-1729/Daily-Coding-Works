//If you have a List<Integer>

int sum = list.stream().mapToInt(Integer::intValue).sum();


//If it's an int[]

int sum = IntStream.of(a).sum();
