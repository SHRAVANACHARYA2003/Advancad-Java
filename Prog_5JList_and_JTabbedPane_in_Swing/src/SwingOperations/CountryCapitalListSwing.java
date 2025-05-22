package SwingOperations;
import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class CountryCapitalListSwing extends JFrame {
    private JList<String> countryList;
    private HashMap<String, String> countryCapitalMap;

    public CountryCapitalListSwing() {
        countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "Addis Ababa");
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String country : countryCapitalMap.keySet()) {
            listModel.addElement(country);
        }

        
        countryList = new JList<>(listModel);
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    for (String country : selectedCountries) {
                        String capital = countryCapitalMap.get(country);
                        if (capital != null) {
                            System.out.println("Capital of " + country + " is: " + capital);
                        }
                    }
                }
            }
        });

        
        add(new JScrollPane(countryList));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Country and Capital Viewer");
        this.setSize(300, 250);
        this.setLocationRelativeTo(null); 
        this.setVisible(true);
    }

	public static void main(String[] args) {
		new CountryCapitalListSwing();

	}

}
