class EvenArray {
    public static void main(String[] args) {

        int numbers[] = {2, 5, 8, 11};

        for(int num : numbers) {

            if(num % 2 == 0) {
                System.out.println(num);
            }

        }

    }
}