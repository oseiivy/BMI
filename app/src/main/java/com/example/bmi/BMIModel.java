package com.example.bmi;

public class BMIModel
{
    private double weight;
    private double height;

    public BMIModel(String w, String h)
    {
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }

    public String getBMI()
    {
        double index = this.weight / (this.height * this.height);
        String result = String.format("%.1f", index);
        return result;
    }

    public String toPound()
    {
        double index = this.weight / (this.height * this.height);
        double pound = index/0.454;
        String result = String.format("%.0f", index);


    }

    public static void main(String[] args)
    {
        BMIModel myModel = new BMIModel("100","1.8");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("45", "1.35");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("80","1.2");
        System.out.println(myModel.getBMI());
    }
}
