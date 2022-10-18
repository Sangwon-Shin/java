import java.util.*; // needed to use ArrayList

class Test01 {
    public static void main(String[] args) {
        /*
         * int[] nums = new int[6];
         * 
         * nums[0] = 10;
         * nums[5] = 45;
         * // nums[6] = 1; raises "java.lang.ArrayIndexOutOfBoundsException"
         * // System.out.println(nums[6]);
         * 
         * ArrayList list = new ArrayList();
         * for (int i = 0; i < 30; i++) {
         * list.add(i+1);
         * }
         * // 향상된 for 명령(forEach)
         * for(Object o:list){
         * System.out.println(o);
         * }
         * list.add(100);
         * System.out.println(list.get(30));
         */
        HashSet<Integer> set = new HashSet<Integer>();

        int idx = 0;
        for (; set.size() < 6;) {
            set.add((int) (Math.random() * 45 + 1));
            ++idx;
        }

        Iterator<Integer> itor = set.iterator();
        while (itor.hasNext()) {
            System.out.print(itor.next() + " | ");
        }
        System.out.println("\nidx: " + idx);

        HashMap map = new HashMap();
        map.put("name", "jennie");
        map.put("age", 27);
        map.put("gen", 'F');
        System.out.printf("name: %s\nage: %d\ngender: %c\n", map.get("name"), map.get("age"), map.get("gen"));
    }
}