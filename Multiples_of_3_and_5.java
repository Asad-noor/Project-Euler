public static void main(String []args){
        int given = 1000;
        int threeMultiple = 0;
        long total = 0;
        int count = 1;
        while (threeMultiple < given) {
            threeMultiple = 3 * count;
            
            if(threeMultiple < given){
                total += threeMultiple;
                count++;
                //System.out.println(threeMultiple);
            }
        }
        threeMultiple = 0;
        count = 1;
        while (threeMultiple < given) {
            threeMultiple = 5 * count;
            
            if(threeMultiple < given && threeMultiple % 3 != 0){
                total += threeMultiple;
                System.out.println(threeMultiple);
            }
            count++;
        }
        System.out.println(total);
     }
