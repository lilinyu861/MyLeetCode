package loseWeight;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 计算人体代谢
 * 包括基础代谢+食物热效应+身体活动消耗
 */

public class Metabolism {
    public static final DecimalFormat df1 = new DecimalFormat( "#.##" );
    // 计算基础代谢
    private static void BMR(int sex, double weight, double height, double age){
        double bmr = 0;
        if(sex == 1){
            bmr = (13.7*weight)+5.0*height-(6.8*age)+66;
        }
        else if(sex == 0){
            bmr = (9.6*weight)+1.8*height-(4.7*age)+655;
        }
        else{
            System.out.println("您输入的性别有误，请按照要求输入值，谢谢！");
        }
        System.out.println("您身体每天的基础代谢为："+df1.format(bmr)+"kcal"+"("+df1.format(bmr*4.184)+"KJ)");
    }

    private static void needKcal(double weight, double height, double age){
        double eneage = 655.096+9.563*weight+1.85*height-4.676*age;
        System.out.println("您每日所须基础能量为："+ df1.format(eneage)+"kcal"+"("+df1.format(eneage*4.184)+"KJ)");
    }

    //计算每日运动消耗卡路里
    private static void consumption(int sex, double weight, double height, double age, double excise){
            double spt = 0;
            excise = (excise/10)+1;
            if(sex == 0){
                spt = (65.5+9.6*weight+1.9*height-4.7*age)*excise;
            }
            else if(sex == 1){
                spt = (66+1.38*weight+5*height-6.8*age)*excise;
            }
            else {
                System.out.println("您输入的性别有误，请按照要求输入值，谢谢！");
            }
            System.out.println("您今天活动消耗的卡路里为："+df1.format(spt)+"kcal"+"("+df1.format(spt*4.184)+"KJ)");
    }

    // 计算
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您的性别，0表示女，1表示男");
        int sex = in.nextInt();
        System.out.println("请输入您的体重(kg)");
        double weight = in.nextDouble();
        System.out.println("请输入您的身高(cm)");
        double height= in.nextDouble();
        System.out.println("请输入您的年龄(岁)");
        double age = in.nextDouble();
        System.out.println("请输入您今天的运动等级：1表示长坐办公室；2表示有时常走动；3表示有剧烈运动");
        double excise = in.nextInt();
        BMR(sex, weight,height, age);
        needKcal(weight, height, age);
        consumption(sex, weight,height, age, excise);

    }


}
