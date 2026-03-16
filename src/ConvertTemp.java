class ConvertTemp{
    public static void main(String[] args) {
        ConvertTemp obj=new ConvertTemp();
        double[] ans=obj.convertTemperature(36.50);
        System.out.println("Kelvin: "+ans[0]);
        System.out.println("Fahrenheit: "+ans[1]);
    }
    public double[] convertTemperature(double celsius) {
        double[] ans=new double[2];
        ans[0]=celsius+273.15;
        ans[1]=celsius*1.80+32.00;
        return ans;
    }
}