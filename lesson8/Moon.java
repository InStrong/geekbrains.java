package lesson8;

import javax.swing.*;
import java.awt.*;



public class Moon extends JFrame {
        public Moon() {
            setBounds(500, 200, 800, 600);
            setTitle("GUI Demo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());
            JPanel jp = new JPanel();

            this.add(jp);


            jp.setLayout(new GridLayout(5,1));
            JLabel temperatureInfo = new JLabel("Temperature in Celsius");
            JLabel temperatureCelcius = new JLabel("0 degrees");
            JLabel temperatureFahrenheitInfo = new JLabel("Temperature in Fahrenheit");
            JLabel temperatureFahrenheit = new JLabel("32 degrees");


            JSlider temperatureSlider = new JSlider();
            temperatureSlider.setValue(0);
            temperatureSlider.setMinimum(-100);
            temperatureSlider.setMaximum(300);

            temperatureCelcius.setHorizontalAlignment(SwingConstants.CENTER);
            temperatureFahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
            temperatureFahrenheitInfo.setHorizontalAlignment(SwingConstants.CENTER);
            temperatureInfo.setHorizontalAlignment(SwingConstants.CENTER);

            jp.add(temperatureInfo,BorderLayout.CENTER);
            jp.add(temperatureCelcius,BorderLayout.CENTER);
            jp.add(temperatureSlider,BorderLayout.CENTER);
            jp.add(temperatureFahrenheitInfo,BorderLayout.CENTER);
            jp.add(temperatureFahrenheit,BorderLayout.CENTER);




            temperatureSlider.addChangeListener(e -> temperatureCelcius.setText(String.valueOf(temperatureSlider.getValue())+" degrees"));
            temperatureSlider.addChangeListener(e -> temperatureFahrenheit.setText(String.valueOf((temperatureSlider.getValue()*1.8+32)+" degrees")));

//            JRadioButton[] temperature = new JRadioButton[4];
//            ButtonGroup bgroup = new ButtonGroup();
//            temperature[0] = new JRadioButton("Fahrenheit to Celsius");
//            temperature[1] = new JRadioButton("Celsius to Fahrenheit");
//            bgroup.add(temperature[0]);
//            bgroup.add(temperature[1]);
//
//
//
//            jp.add(temperature[0]);
//            jp.add(temperature[1]);



            JMenuBar mainMenu = new JMenuBar();
            JMenu mFile = new JMenu("File");
            JMenuItem miFileExit = new JMenuItem("Exit");
            JMenuItem miFileReset = new JMenuItem("Reset");

            setJMenuBar(mainMenu);
            mainMenu.add(mFile);

            mFile.addSeparator();
            mFile.add(miFileReset);
            mFile.add(miFileExit);

            miFileExit.addActionListener(e -> System.exit(0));
            miFileReset.addActionListener(e -> temperatureSlider.setValue(0));
            


            setVisible(true);
        }
    }

