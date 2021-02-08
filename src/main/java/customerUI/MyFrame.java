package customerUI;

import javax.swing.*;

import customerUser.*;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MyFrame extends JFrame implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel name;
	private JLabel firtname;
	private JTextField tname;
	private JTextField tfirtname;
	private JLabel mno;
	private JTextField tmno;
	private JLabel birthCity;
	private JTextField tbirthCity;

	private JLabel zipCode;
	private JTextField tzipCode;

	private JLabel numerAdress;
	private JTextField tnumerAdress;

	private JLabel city;
	private JTextField tcity;

	private JLabel email;
	private JTextField temail;

	private JLabel codClient;
	private JTextField tcodClient;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel add;
	private JTextField tadd;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JButton listClient;
	private JButton resseter;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;

	private String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	private String months[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
	private String years[] = { "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
			"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
			"2016", "2017", "2018", "2019", "2020", "2021" };
	private MyUserController myUserController = null;

	// constructor, to initialize the components
	// with default values.
	public MyFrame() {
		setTitle("Gestion financiere");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Enregistrement Compte Client");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		title.setSize(350, 30);
		title.setLocation(300, 30);
		c.add(title);
		myUserController = new MyUserController();
		name = new JLabel("Nom");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(50, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(100, 20);
		tname.setLocation(130, 100);
		c.add(tname);

		firtname = new JLabel("Prenom");
		firtname.setFont(new Font("Arial", Font.PLAIN, 20));
		firtname.setSize(120, 20);
		firtname.setLocation(250, 100);
		c.add(firtname);

		tfirtname = new JTextField();
		tfirtname.setFont(new Font("Arial", Font.PLAIN, 15));
		tfirtname.setSize(120, 20);
		tfirtname.setLocation(340, 100);
		c.add(tfirtname);

		mno = new JLabel("Mobile");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(250, 150);
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(100, 20);
		tmno.setLocation(130, 150); // code client
		c.add(tmno);

		codClient = new JLabel("N.Client");
		codClient.setFont(new Font("Arial", Font.PLAIN, 20));
		codClient.setSize(100, 20);
		codClient.setLocation(50, 150);
		c.add(codClient);

		tcodClient = new JTextField();
		tcodClient.setFont(new Font("Arial", Font.PLAIN, 15));
		tcodClient.setSize(120, 20);
		tcodClient.setLocation(340, 150);
		tcodClient.setEditable(false); // numero mobile
		c.add(tcodClient);

		gender = new JLabel("Genre");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(50, 200);
		c.add(gender);

		male = new JRadioButton("Homme");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(85, 20);
		male.setLocation(150, 200);
		c.add(male);

		female = new JRadioButton("Femme");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(85, 20);
		female.setLocation(230, 200);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		dob = new JLabel("Ne(e) le");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(50, 250);
		c.add(dob);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(130, 250);
		c.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(180, 250);
		c.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(240, 250);
		c.add(year);

		birthCity = new JLabel("Ne(e) : ");
		birthCity.setFont(new Font("Arial", Font.PLAIN, 20));
		birthCity.setSize(100, 20);
		birthCity.setLocation(50, 300);
		c.add(birthCity);

		tbirthCity = new JTextField();
		tbirthCity.setFont(new Font("Arial", Font.PLAIN, 15));
		tbirthCity.setSize(120, 20);
		tbirthCity.setLocation(130, 300);
		c.add(tbirthCity);

		add = new JLabel("Rue");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(50, 350);
		c.add(add);

		tadd = new JTextField();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(160, 20);
		tadd.setLocation(130, 350);
		c.add(tadd);

		numerAdress = new JLabel("Num.");
		numerAdress.setFont(new Font("Arial", Font.PLAIN, 20));
		numerAdress.setSize(70, 20);
		numerAdress.setLocation(310, 350);
		c.add(numerAdress);

		tnumerAdress = new JTextField();
		tnumerAdress.setFont(new Font("Arial", Font.PLAIN, 15));
		tnumerAdress.setSize(90, 20);
		tnumerAdress.setLocation(370, 350);
		c.add(tnumerAdress);

		zipCode = new JLabel("Code P");
		zipCode.setFont(new Font("Arial", Font.PLAIN, 20));
		zipCode.setSize(100, 20);
		zipCode.setLocation(50, 400);
		c.add(zipCode);

		tzipCode = new JTextField();
		tzipCode.setFont(new Font("Arial", Font.PLAIN, 15));
		tzipCode.setSize(70, 20);
		tzipCode.setLocation(130, 400);
		c.add(tzipCode);

		city = new JLabel("Ville");
		city.setFont(new Font("Arial", Font.PLAIN, 20));
		city.setSize(140, 20);
		city.setLocation(220, 400);
		c.add(city);

		tcity = new JTextField();
		tcity.setFont(new Font("Arial", Font.PLAIN, 15));
		tcity.setSize(160, 20);
		tcity.setLocation(270, 400);
		c.add(tcity);

		email = new JLabel("Email");
		email.setFont(new Font("Arial", Font.PLAIN, 20));
		email.setSize(100, 20);
		email.setLocation(50, 450);
		c.add(email);

		temail = new JTextField();
		temail.setFont(new Font("Arial", Font.PLAIN, 15));
		temail.setSize(250, 20);
		temail.setLocation(130, 450);
		c.add(temail);

		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(150, 480);
		c.add(term);

		sub = new JButton("Ajouter");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(100, 510);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Supprimer");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(110, 20);
		reset.setLocation(220, 510);
		reset.addActionListener(this);
		c.add(reset);

		listClient = new JButton("Liste Client");
		listClient.setFont(new Font("Arial", Font.PLAIN, 15));
		listClient.setSize(130, 20);
		listClient.setLocation(340, 510);
		listClient.addActionListener(this);
		c.add(listClient);
		
		resseter = new JButton("Initialiser");
		resseter.setFont(new Font("Arial", Font.PLAIN, 15));
		resseter.setSize(130, 20);
		resseter.setLocation(480, 510);
		resseter.addActionListener(this);
		c.add(resseter);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(385, 400);
		tout.setLocation(490, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 530);
		c.add(res);
//  
//        resadd = new JTextArea(); 
//        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
//        resadd.setSize(200, 75); 
//        resadd.setLocation(580, 175); 
//        resadd.setLineWrap(true); 
//        c.add(resadd); 

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sub) {
			
			String firstName = tfirtname.getText().trim();
			String name = tname.getText().trim();

			String gender = null;
			gender = male.isSelected() ? "H" : "F";

			String refNumber = tmno.getText().trim(); // code client
			String birtCity = tbirthCity.getText().trim();

			String day = ((String) date.getSelectedItem()).trim();
			String month1 = ((String) month.getSelectedItem()).trim();
			String year1 = ((String) year.getSelectedItem()).trim();
			int dayNumer = Integer.parseInt(day);
			int monthNumber = Integer.parseInt(month1);
			int yearNumber = Integer.parseInt(year1);
			LocalDate birthDay = LocalDate.of(yearNumber, monthNumber, dayNumer);

			String email = temail.getText().trim();
			String streetAdress = tadd.getText().trim();
			String city = tcity.getText().trim();

			String zipCodeStr = tzipCode.getText().trim();
			int zipCode = Integer.parseInt(zipCodeStr);
			String streetNumberStr = tnumerAdress.getText().trim();
			int streetNumber = Integer.parseInt(streetNumberStr);

			Customer customer = new Customer(firstName, name, gender, refNumber, birtCity, birthDay, email, city,
					zipCode, streetAdress, streetNumber);
			
			if (term.isSelected()) {
				boolean b = myUserController.add(customer);
				if(b) {
					res.setText("Compte client cree avec success..");
					tout.setText((""));
					showAll();
				} else {
					res.setText("Probleme lors della creation du compte ...");
				}
				
			} else {

				res.setText("Veuillez accepter les terms & conditions...");
			}
		}

		else if (e.getSource() == reset) {
			

				String firstName = tfirtname.getText().trim();
				String name = tname.getText().trim();

				String gender = null;
				gender = male.isSelected() ? "H" : "F";

				String refNumber = tmno.getText().trim(); // code client
				String birtCity = tbirthCity.getText().trim();

				String day = ((String) date.getSelectedItem()).trim();
				String month1 = ((String) month.getSelectedItem()).trim();
				String year1 = ((String) year.getSelectedItem()).trim();
				
				 LocalDate bd = null;
				String insertedDate = year1 + "-" + month1 + "-" + day;
				try {
					bd = LocalDate.parse(insertedDate);
				}
				catch (DateTimeParseException e1) {
					// System.out.println("Erreur de Format.");
					bd = null;
				}
				// LocalDate bd = getInput().askUserForDate();
				
//				int dayNumer = Integer.parseInt(day);
//				int monthNumber = Integer.parseInt(month1);
//				int yearNumber = Integer.parseInt(year1);
//				LocalDate birthDay = LocalDate.of(yearNumber, monthNumber, dayNumer);

				String email = temail.getText().trim();
				String streetAdress = tadd.getText().trim();
				String city = tcity.getText().trim();

				String zipCodeStr = tzipCode.getText().trim();
				int zipCode = Integer.parseInt(zipCodeStr);
				String streetNumberStr = tnumerAdress.getText().trim();
				int streetNumber = Integer.parseInt(streetNumberStr);

				Customer customer = new Customer(firstName, name, gender, refNumber, birtCity, bd, email, city,
						zipCode, streetAdress, streetNumber);
//				int index = -2;
//						index = myUserController.indexOf(customer);
				
				if (term.isSelected()) {
				//User user = myUserController.remove(index);
					boolean b = myUserController.remove(customer);
				if(b) {
					res.setText("Compte client supprime avec success..");
					tout.setText((""));
					showAll();
				} else {
					res.setText("Probleme lors suppression du compte ...");
				}
				
			} else {

				res.setText("Veuillez accepter les terms & conditions...");
				String output = "";
			}

		} else if (e.getSource() == listClient) {
			showAll();
//			if (term.isSelected()) {
//				String firstName = tfirtname.getText().trim();
//				String name = tname.getText().trim();
//
//				String gender = null;
//				gender = male.isSelected() ? "H" : "F";
//
//				String refNumber = tmno.getText().trim(); // code client
//				String birtCity = tbirthCity.getText().trim();
//
//				String day = ((String) date.getSelectedItem()).trim();
//				String month1 = ((String) month.getSelectedItem()).trim();
//				String year1 = ((String) year.getSelectedItem()).trim();
//				int dayNumer = Integer.parseInt(day);
//				int monthNumber = Integer.parseInt(month1);
//				int yearNumber = Integer.parseInt(year1);
//				LocalDate birthDay = LocalDate.of(yearNumber, monthNumber, dayNumer);
//
//				String email = temail.getText().trim();
//				String streetAdress = tadd.getText().trim();
//				String city = tcity.getText().trim();
//
//				String zipCodeStr = tzipCode.getText().trim();
//				int zipCode = Integer.parseInt(zipCodeStr);
//				String streetNumberStr = tnumerAdress.getText().trim();
//				int streetNumber = Integer.parseInt(streetNumberStr);
//
//				Customer customer = new Customer(firstName, name, gender, refNumber, birtCity, birthDay, email, city,
//						zipCode, streetAdress, streetNumber);
//
//				tout.setText((customer.toString() + "\n"));
//
//				// tout.setText((customer.toStringFull() + "\n"));
//				res.setText("Compte client cr�e avec success..");
//			} else {
//
//				res.setText("Veuillez accepter les terms & conditions...");
//			}

		}else if (e.getSource() == resseter) {
			tout.setText((""));
			res.setText((""));
		}

	}

//	private void print() {
//		if (term.isSelected()) {
//			String data1;
//			String data = "Name : " + tname.getText() + "\n" + "Mobile : " + tmno.getText() + "\n";
//			if (male.isSelected())
//				data1 = "Gender : Male" + "\n";
//			else
//				data1 = "Gender : Female" + "\n";
//			String data2 = "DOB : " + (String) date.getSelectedItem() + "/" + (String) month.getSelectedItem() + "/"
//					+ (String) year.getSelectedItem() + "\n";
//
//			String data3 = "Address : " + tadd.getText();
//			tout.setText(data + data1 + data2 + data3);
//			tout.setEditable(false);
//			res.setText("Registration Successfully..");
//		} else {
//			tout.setText("");
//			resadd.setText("");
//			res.setText("Please accept the" + " terms & conditions..");
//		}

//		String def = "";
//		tname.setText(def);
//		tadd.setText(def);
//		tmno.setText(def);
//		res.setText(def);
//		tout.setText(def);
//		term.setSelected(false);
//		date.setSelectedIndex(0);
//		month.setSelectedIndex(0);
//		year.setSelectedIndex(0);
//		resadd.setText(def);

//	}

	/*
	 * private void add() {
	 * 
	 * String firstName = tfirtname.getText().trim(); String name =
	 * tname.getText().trim();
	 * 
	 * String gender = null; gender = male.isSelected() ? "H" : "F";
	 * 
	 * String refNumber = tmno.getText().trim(); // code client String birtCity =
	 * tbirthCity.getText().trim();
	 * 
	 * String day = ((String) date.getSelectedItem()).trim(); String month1 =
	 * ((String) month.getSelectedItem()).trim(); String year1 = ((String)
	 * year.getSelectedItem()).trim(); int dayNumer = Integer.parseInt(day); int
	 * monthNumber = Integer.parseInt(month1); int yearNumber =
	 * Integer.parseInt(year1); LocalDate birthDay = LocalDate.of(dayNumer,
	 * monthNumber, yearNumber);
	 * 
	 * String email = temail.getText().trim(); String streetAdress =
	 * tadd.getText().trim(); String city = tcity.getText().trim();
	 * 
	 * String zipCodeStr = tzipCode.getText().trim(); int zipCode =
	 * Integer.parseInt(zipCodeStr); int streetNumber =
	 * Integer.parseInt(streetAdress); // String streetNumberStr = null;
	 * 
	 * }
	 * 
	 * private void remove() {
	 * 
	 * String firstName = tfirtname.getText().trim(); String name =
	 * tname.getText().trim();
	 * 
	 * String gender = null; gender = male.isSelected() ? "H" : "F";
	 * 
	 * String refNumber = tmno.getText().trim(); // code client String birtCity =
	 * tbirthCity.getText().trim();
	 * 
	 * String day = ((String) date.getSelectedItem()).trim(); String month1 =
	 * ((String) month.getSelectedItem()).trim(); String year1 = ((String)
	 * year.getSelectedItem()).trim(); int dayNumer = Integer.parseInt(day); int
	 * monthNumber = Integer.parseInt(month1); int yearNumber =
	 * Integer.parseInt(year1); LocalDate birthDay = LocalDate.of(dayNumer,
	 * monthNumber, yearNumber);
	 * 
	 * String email = temail.getText().trim(); String streetAdress =
	 * tadd.getText().trim(); String city = tcity.getText().trim();
	 * 
	 * String zipCodeStr = tzipCode.getText().trim(); int zipCode =
	 * Integer.parseInt(zipCodeStr); int streetNumber =
	 * Integer.parseInt(streetAdress); // String streetNumberStr = null;
	 * 
	 * }
	 */

	public void showAll() {
		UserCollection medias = myUserController.getAll();
		print(medias);
	}
	
	

	private void print(UserCollection medias) {
		String output = "";
		tout.setText((""));
		for (int i = 0; i < medias.size(); i++) {
			//System.out.println(medias.get(i));
			output = output + medias.get(i).toString() + "\n";
			
		}
		tout.setText((output));
	}

}
