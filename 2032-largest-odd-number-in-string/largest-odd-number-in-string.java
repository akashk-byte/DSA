class Solution {
    public String largestOddNumber(String num) {
        //StringBuilder ans = new StringBuilder();
          //int a=0;
        for(int i=num.length()-1;i>=0;i--){
            //int digit = num.charAt(i);
            if(num.charAt(i) % 2!=0){
               return num.substring(0,i+1);
            }
        }
        return "";
    }

    }
