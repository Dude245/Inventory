/*
 *Point of sale system for STEGH Gift Shop
 */
package Main;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import static Main.FileIO.*;

/**
 * @author Nathan A GUI to add, search, and
 */
public class Gui extends JFrame implements ActionListener {

    //Declare buttons and menu items
    private final JMenuItem add = new JMenuItem("Add");
    private final JMenuItem exit = new JMenuItem("Exit");
    private final JButton tagSearch = new JButton("Search");
    private final JButton addB = new JButton("Add");
    private final JButton editB = new JButton("Edit");
    private final JButton goBack = new JButton("Go Back");
    private final JButton saveB = new JButton("Save Changes");
    private final JButton confirm = new JButton("Confirm");
    final JFileChooser choose = new JFileChooser();
    final FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Comma Separated Values", "csv");
    JMenuItem search = new JMenuItem("Search");
    int Y = 34;
    JFrame frame = new JFrame("Inventory");
    JMenuBar menuBar = new JMenuBar();
    JTextArea menuBox = new JTextArea();
    JMenu menu = new JMenu("File");

    //Change ICON
    //ImageIcon img = new ImageIcon("P:\\Gift Shop\\Data\\shop.gif");

    //Labels and text fields
    JLabel assTagLbl = new JLabel("Asset Tag: ");
    JTextField assTag = new JTextField();
    JLabel stationNameLbl = new JLabel("Station Name:");
    JTextField stationName = new JTextField();
    JLabel modelNumLbl = new JLabel("Model number:");
    JTextField modelNum = new JTextField();
    JLabel snLBL = new JLabel("Serial Number:");
    JTextField sn = new JTextField();
    JLabel cBarCLbl = new JLabel("Asset Tag:");
    JTextField cBarC = new JTextField();
    JTextArea LabelCode = new JTextArea();

    JLabel locationLbl = new JLabel("Location:");
    JTextField location = new JTextField();
    JButton resetA = new JButton("Reset");
    JButton resetS = new JButton("Reset");
    JLabel searchLbl = new JLabel("Search");
    JLabel DescriptLbl = new JLabel("Description:");
    JTextField descript = new JTextField();
    JLabel deviceTypelbl = new JLabel("Device Type:");
    JTextField deviceType = new JTextField();
    JLabel miscLbl = new JLabel("Notes:");
    JTextField misc = new JTextField();
    JLabel PricingLbl = new JLabel("Price:");
    JTextField price = new JTextField();
    JLabel DATELbl = new JLabel("Date:");
    JTextField date = new JTextField();
    JLabel vendorLbl = new JLabel("Vendor:");
    JTextField vendor = new JTextField();
    JLabel invoiceLbl = new JLabel("Invoice:");
    JTextField invoice = new JTextField();
    JLabel UPScLbl = new JLabel("UPS:");
    JTextField ups = new JTextField();
    JLabel assetTagLbl = new JLabel("Device Name:");
    JTextField assetTag = new JTextField();

    JLabel steghLogo = new JLabel("");

    ArrayList<String[]> list;

    //This class contains the GUI elements
    public Gui() throws InterruptedException, IOException {
        //Add the items to the menu/GUI
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        add.addActionListener(this);
        exit.addActionListener(this);
        search.addActionListener(this);
        addB.addActionListener(this);
        editB.addActionListener(this);
        resetA.addActionListener(this);
        resetS.addActionListener(this);
        goBack.addActionListener(this);
        confirm.addActionListener(this);
        tagSearch.addActionListener(this);
        assTag.addActionListener(this);
        saveB.addActionListener(this);


        frame.setLayout(null);
        menu.add(exit);
//        menu2.add(createL);
        frame.setBackground(Color.white);
        frame.setSize(440, 500);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set items to invisible/Set where they are;
        assTagLbl.setBounds(25, Y, 100, 25);
        frame.add(assTagLbl);
        assTag.setBounds(120, Y, 150, 25);
        frame.add(assTag);
        cBarCLbl.setBounds(25, 80, 100, 25);
        frame.add(cBarCLbl);
        LabelCode.setBounds(25, 80, 100, 25);
        frame.add(LabelCode);
        cBarC.setBounds(120, 90, 150, 25);
        frame.add(cBarC);
        frame.add(stationName);
        resetA.setBounds(300, 100, 80, 25);
        resetS.setBounds(300, 100, 80, 25);
        frame.add(resetA);
        frame.add(resetS);
        DescriptLbl.setBounds(25, 160, 100, 25);
        frame.add(DescriptLbl);

        //Searches

        frame.add(stationNameLbl);
        descript.setBounds(120, 130, 160, 25);
        frame.add(descript);
        location.setBounds(120, Y * 2, 150, 25);
        frame.add(location);
        locationLbl.setBounds(25, Y * 2, 150, 25);
        frame.add(locationLbl);
        stationName.setBounds(120, Y * 3, 150, 25);
        stationNameLbl.setBounds(25, Y * 3, 100, 25);
        deviceType.setBounds(120, Y * 4, 150, 25);
        frame.add(deviceType);
        deviceTypelbl.setBounds(25, Y * 4, 150, 25);
        frame.add(deviceTypelbl);
        modelNum.setBounds(120, Y * 5, 150, 25);
        frame.add(modelNum);
        modelNumLbl.setBounds(25, Y * 5, 150, 25);
        frame.add(modelNumLbl);
        snLBL.setBounds(25, Y * 6, 150, 25);
        sn.setBounds(120, Y * 6, 150, 25);
        frame.add(snLBL);
        frame.add(sn);

        PricingLbl.setBounds(25, Y * 7, 150, 25);
        price.setBounds(120, Y * 7, 150, 25);
        frame.add(PricingLbl);
        frame.add(price);

        DATELbl.setBounds(25, Y * 8, 150, 25);
        date.setBounds(120, Y * 8, 150, 25);
        frame.add(DATELbl);
        frame.add(date);


        vendorLbl.setBounds(25, Y * 9, 150, 25);
        vendor.setBounds(120, Y * 9, 150, 25);
        frame.add(vendorLbl);
        frame.add(vendor);


        invoiceLbl.setBounds(25, Y * 10, 150, 25);
        invoice.setBounds(120, Y * 10, 150, 25);
        frame.add(invoiceLbl);
        frame.add(invoice);


        miscLbl.setBounds(25, Y * 11, 150, 25);
        misc.setBounds(120, Y * 11, 150, 25);
        frame.add(miscLbl);
        frame.add(misc);


        UPScLbl.setBounds(25, Y * 12, 150, 25);
        ups.setBounds(120, Y * 12, 50, 25);
        frame.add(UPScLbl);
        frame.add(ups);


        //Add more items
        tagSearch.setBounds(25, 150, 200, 25);
        frame.add(tagSearch);
        searchLbl.setBounds(25, 00, 200, 25);
        frame.add(searchLbl);
        editB.setBounds(300, 220, 90, 60);
        frame.add(editB);

        //Buttons
        goBack.setBounds(300, 100, 90, 60);
        frame.add(goBack);
        saveB.setBounds(200, 320, 250, 25);
        frame.add(saveB);
        confirm.setBounds(250, 400, 80, 25);
        frame.add(confirm);
        addB.setBounds(60, 25, 250, 50);
        frame.add(addB);


        // Start


        assetTagLbl.setBounds(40, 80, 100, 40);
        frame.add(assetTagLbl);
        assetTag.setBounds(120, 90, 150, 20);
        frame.add(assetTag);
        cBarCLbl.setBounds(40, 80, 100, 40);
        frame.add(cBarCLbl);
        LabelCode.setBounds(40, 80, 100, 40);
        frame.add(LabelCode);
        cBarC.setBounds(120, 90, 150, 20);
        frame.add(cBarC);

        //Start
        //Pic
        //steghLogo.setIcon(new ImageIcon("P:\\Gift Shop\\Data\\stegh.gif"));
        //  steghLogo.setBounds(0, 340, 400, 120);
        // frame.add(steghLogo);
        // frame.setIconImage(img.getImage());

        stationName.setEditable(false);
        modelNum.setEditable(false);
        deviceType.setEditable(false);


        //Setting everything to invisible
        assTag.setVisible(false);
        assTagLbl.setVisible(false);
        stationNameLbl.setVisible(false);
        stationName.setVisible(false);
        resetA.setVisible(false);
        resetS.setVisible(false);
        DescriptLbl.setVisible(false);
        descript.setVisible(false);
        modelNum.setVisible(false);
        modelNumLbl.setVisible(false);
        deviceType.setVisible(false);
        addB.setVisible(false);
        goBack.setVisible(false);
        editB.setVisible(false);
        searchLbl.setVisible(false);
        deviceTypelbl.setVisible(false);
        tagSearch.setVisible(false);
        addB.setVisible(false);
        confirm.setVisible(false);
        saveB.setVisible(false);
        steghLogo.setVisible(true);
        sn.setVisible(false);
        snLBL.setVisible(false);
        location.setVisible(false);
        locationLbl.setVisible(false);
        cBarCLbl.setVisible(false);
        cBarC.setVisible(false);
        LabelCode.setVisible(false);
        PricingLbl.setVisible(false);
        price.setVisible(false);
        DATELbl.setVisible(false);
        date.setVisible(false);
        miscLbl.setVisible(false);
        misc.setVisible(false);
        UPScLbl.setVisible(false);
        ups.setVisible(false);
        vendor.setVisible(false);
        vendorLbl.setVisible(false);
        invoice.setVisible(false);
        invoiceLbl.setVisible(false);

        assetTag.setVisible(true);
        assetTagLbl.setVisible(true);
        tagSearch.setVisible(true);
        assetTag.requestFocusInWindow();

//
//        location.setText(list.get(1)[1]);
//        stationName.setText(list.get(1)[2]);
//        deviceType.setText(list.get(1)[3]);
//        modelNum.setText(list.get(1)[4]);
//        sn.setText(list.get(1)[5]);
//        price.setText(list.get(1)[7]);
//        date.setText(list.get(1)[8]);
//        assTag.setText(list.get(1)[9]);
//        vendor.setText(list.get(1)[10]);
//        invoice.setText(list.get(1)[11]);
//        ups.setText(list.get(1)[12]);

    }

//Aylmer,,AYLCHKIN-W7,tower,8910-APU,MJXWC75,,$690.29 ,5/12/2010,1004857,protek,INV053003,YES
    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent E) {
        list = readIn();
        //Begin Search
        if (E.getActionCommand() == "Search") {
            int found = 0;
            //Start the main search structure

            for (int i = 0; i < list.size(); i++) {
                //Debug
//            for(int j=0;j<13;j++)
//            {
//                System.out.print(j);
//                System.out.print(list.get(i)[j]);
//                System.out.print(", ");
//            }
//            System.out.println();
                String searchText = assetTag.getText();
                if (list.get(i)[2].equalsIgnoreCase(searchText)) {
                    assetTag.setVisible(false);
                    assetTagLbl.setVisible(false);
                    tagSearch.setVisible(false);
                    location.setVisible(true);
                    locationLbl.setVisible(true);
                    sn.setVisible(true);
                    location.setEditable(false);
                    snLBL.setVisible(true);
                    sn.setEditable(true);
                    stationName.setEditable(true);
                    modelNum.setEditable(true);
                    deviceType.setEditable(true);
                    assTag.setEditable(false);
                    tagSearch.setVisible(false);
                    assTag.setVisible(true);
                    assTagLbl.setVisible(true);
                    addB.setVisible(false);
                    goBack.setVisible(true);
                    addB.setVisible(false);
                    goBack.setVisible(true);
                    editB.setVisible(true);
                    deviceTypelbl.setVisible(false);
                    searchLbl.setVisible(false);
                    menuBox.setVisible(false);
                    stationNameLbl.setVisible(true);
                    stationName.setVisible(true);
                    DescriptLbl.setVisible(false);
                    descript.setVisible(false);
                    resetA.setVisible(false);
                    resetS.setVisible(false);
                    deviceType.setVisible(true);
                    deviceTypelbl.setVisible(true);
                    modelNumLbl.setVisible(true);
                    modelNum.setVisible(true);
                    PricingLbl.setVisible(true);
                    price.setVisible(true);
                    DATELbl.setVisible(true);
                    date.setVisible(true);
                    miscLbl.setVisible(true);
                    misc.setVisible(true);
                    UPScLbl.setVisible(true);
                    ups.setVisible(true);
                    vendor.setVisible(true);
                    vendorLbl.setVisible(true);
                    invoice.setVisible(true);
                    invoiceLbl.setVisible(true);


                    location.setText(list.get(i)[1]);

                    if(list.get(i)[2].toUpperCase().startsWith("ADM"))
                        location.setText("Admin Building");
                    else if(list.get(i)[2].toUpperCase().startsWith("AYL"))
                        location.setText("Aylmer");
                    else if(list.get(i)[2].toUpperCase().startsWith("STR"))
                        location.setText("Straffordville");
                    else if(list.get(i)[2].toUpperCase().startsWith("BEL"))
                        location.setText("Belmont");
                    else if(list.get(i)[2].toUpperCase().startsWith("DUT"))
                        location.setText("Dutton");
                    else if(list.get(i)[2].toUpperCase().startsWith("PTB"))
                        location.setText("Port Burwell");
                    else if(list.get(i)[2].toUpperCase().startsWith("PTS"))
                        location.setText("Port Stanley");
                    else if(list.get(i)[2].toUpperCase().startsWith("ROD"))
                        location.setText("Rodney");
                    else if(list.get(i)[2].toUpperCase().startsWith("SHE"))
                        location.setText("Shedden");
                    else if(list.get(i)[2].toUpperCase().startsWith("SPR"))
                        location.setText("Springfield");
                    else if(list.get(i)[2].toUpperCase().startsWith("WL"))
                        location.setText("West Lorne");
                    else if(list.get(i)[2].toUpperCase().startsWith("EM"))
                        location.setText("Elgin Manor");
                    else if(list.get(i)[2].toUpperCase().startsWith("BV"))
                        location.setText("Bobier Villa");
                    else if(list.get(i)[2].toUpperCase().startsWith("TL"))
                        location.setText("Terrace Lodge");
                    else if(list.get(i)[2].toUpperCase().startsWith("CE"))
                        location.setText("Central Elgin");
                    else if(list.get(i)[2].toUpperCase().startsWith("GSE"))
                        location.setText("Graham Scott Enns");


                    stationName.setText(list.get(i)[2]);
                    deviceType.setText(list.get(i)[3]);
                    modelNum.setText(list.get(i)[4]);
                    sn.setText(list.get(i)[5]);
                    price.setText(list.get(i)[7]);
                    date.setText(list.get(i)[8]);
                    assTag.setText(list.get(i)[9]);
                    vendor.setText(list.get(i)[10]);
                    invoice.setText(list.get(i)[11]);
                    ups.setText(list.get(i)[12]);
                    found = 1;
                    break;
                } else {
                }
            }
            if (found == 0)
                Gui.infoBox("Not found, would you like to add it?", "Not Found");
            //Prompt
        }
//        Add reference menu button
        if (E.getActionCommand() == "Go Back") {
            assTag.setVisible(false);
            assTagLbl.setVisible(false);
            stationNameLbl.setVisible(false);
            stationName.setVisible(false);
            resetA.setVisible(false);
            resetS.setVisible(false);
            DescriptLbl.setVisible(false);
            descript.setVisible(false);
            modelNum.setVisible(false);
            modelNumLbl.setVisible(false);
            deviceType.setVisible(false);
            addB.setVisible(false);
            goBack.setVisible(false);
            editB.setVisible(false);
            searchLbl.setVisible(false);
            deviceTypelbl.setVisible(false);
            tagSearch.setVisible(false);
            addB.setVisible(false);
            confirm.setVisible(false);
            saveB.setVisible(false);
            steghLogo.setVisible(true);
            sn.setVisible(false);
            snLBL.setVisible(false);
            location.setVisible(false);
            locationLbl.setVisible(false);
            cBarCLbl.setVisible(false);
            cBarC.setVisible(false);
            LabelCode.setVisible(false);
            PricingLbl.setVisible(false);
            price.setVisible(false);
            DATELbl.setVisible(false);
            date.setVisible(false);
            miscLbl.setVisible(false);
            misc.setVisible(false);
            UPScLbl.setVisible(false);
            ups.setVisible(false);
            vendor.setVisible(false);
            vendorLbl.setVisible(false);
            invoice.setVisible(false);
            invoiceLbl.setVisible(false);

            assetTag.setVisible(true);
            assetTagLbl.setVisible(true);
            assetTagLbl.setVisible(true);
            tagSearch.setVisible(true);
            assetTag.requestFocusInWindow();
        }

        //Reset button for add
        if (E.getActionCommand() == "Add") {
        }

        //Reset button for edit
        if (E.getActionCommand() == "Edit") {
        }

        if (E.getSource() == exit) {
            System.exit(0);
        }
        validate();
    }

    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Gui aGui = new Gui();

    }
}
