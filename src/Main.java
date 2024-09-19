public class Main {
    public static void main(String[] args) {

        WeatherAPI weatherAPI=new WeatherAPI();
        GUI gui=new GUI(weatherAPI);
        gui.createWindow();
        gui.setUpButton();
        gui.greenBackground();


    }
}
