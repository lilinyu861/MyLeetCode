package com.lily;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        //先将数字反转
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int len1 = num1.length();
        int len2 = num2.length();
        int len = len1+len2;
        int []res = new int[len];
        //计算两数相乘的积，然后存放到res[i+j]中
        for(int i=0; i<len1; i++){
            int a = num1.charAt(i)-'0';
            for(int j=0; j<len2; j++){
                int b = num2.charAt(j)-'0';
                res[i+j] += a*b;
            }
        }
        //将计算出的数字输出
        StringBuilder str = new StringBuilder();
        for(int i=0; i<len; i++){
            int value = res[i]%10;
            int carry = res[i]/10;
            str.insert(0, value);
            if(i < len-1){
                res[i+1] += carry;
            }
        }
        while(str.length()>0 && str.charAt(0)=='0'){
            str.deleteCharAt(0);
        }
        return str.length()==0?"0":str.toString();
    }

    public static void main(String[] args){
        String a = "123";
        String b = "456";
        MultiplyStrings mul = new MultiplyStrings();
        String result = mul.multiply(a, b);
        System.out.println(result);
    }
}
