/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifg_quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class  outputNilai extends JFrame implements ActionListener{
    JLabel judul = new JLabel("Transkrip Nilai");
    JLabel nama = new JLabel("Nama :");
    JTextField inputNama = new JTextField();
    JLabel nim = new JLabel("NIM :");
    JTextField inputNIM = new JTextField();
    JLabel tipekelas = new JLabel("Tipe Kelas :");
    JRadioButton kPraktikum = new JRadioButton("Kelas Praktikum", true);
    JRadioButton kTeori = new JRadioButton("Kelas Teori");
    JLabel matkul = new JLabel("Mata Kuliah :");
    JRadioButton PBO = new JRadioButton("PBO", true);
    JRadioButton SCPK = new JRadioButton("SCPK");
    JRadioButton Algo = new JRadioButton("Algo Lanjut");
    JLabel nilaiTugas = new JLabel("Nilai Tugas :");
    JTextField inputnilaiTugas = new JTextField();
    JLabel nilaiQuiz = new JLabel("Nilai Quiz :");
    JTextField inputnilaiQuiz = new JTextField();
    
    outputNilai(){
        setVisible(true);
        setSize(580, 650);
        setTitle("Halaman Nilai");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(judul);
        judul.setBounds(30, 10, 500, 50);
        judul.setFont (judul.getFont().deriveFont(20.0f));
      
        add(nama);
        nama.setBounds(30, 50, 300, 32);
        nama.setFont (nama.getFont().deriveFont(16.0f));
        add(inputNama);
        inputNama.setBounds(30, 80, 430, 32);
        inputNama.setFont (inputNama.getFont().deriveFont(16.0f));
        
        add(nim);
        nim.setBounds(30, 110, 200, 32);
        nim.setFont (nim.getFont().deriveFont(16.0f));
        add(inputNIM);
        inputNIM.setBounds(30, 140, 430, 32);
        inputNIM.setFont (inputNIM.getFont().deriveFont(16.0f));
        
        add(tipekelas);
        tipekelas.setBounds(30, 185, 300, 32);
        tipekelas.setFont (tipekelas.getFont().deriveFont(16.0f));
        ButtonGroup pilihKelas = new ButtonGroup();
        pilihKelas.add(kPraktikum);
        pilihKelas.add(kTeori);
        
        add(kPraktikum);
        kPraktikum.setBounds(30, 210, 200, 32);
        kPraktikum.setFont (kPraktikum.getFont().deriveFont(16.0f));
        add(kTeori);
        kTeori.setBounds(300, 210, 150, 32);
        kTeori.setFont (kTeori.getFont().deriveFont(16.0f));
        
        add(matkul);
        matkul.setBounds(30, 240, 300, 32);
        matkul.setFont (matkul.getFont().deriveFont(16.0f));
        
        ButtonGroup pilihMatkul = new ButtonGroup();
        pilihMatkul.add(PBO);
        pilihMatkul.add(SCPK);
	pilihMatkul.add(Algo);
        
        add(PBO);
        PBO.setBounds(30, 270, 200, 32);
        PBO.setFont (PBO.getFont().deriveFont(16.0f));
        add(SCPK);
        SCPK.setBounds(150, 270, 150, 32);
        SCPK.setFont (SCPK.getFont().deriveFont(16.0f));
	add(Algo);
        Algo.setBounds(300, 270, 150, 32);
        Algo.setFont (SCPK.getFont().deriveFont(16.0f));
        
        add(nilaiTugas);
        nilaiTugas.setBounds(30, 310, 300, 32);
        nilaiTugas.setFont (nilaiTugas.getFont().deriveFont(16.0f));
        add(inputnilaiTugas);
        inputnilaiTugas.setBounds(30, 340, 430, 32);
        inputnilaiTugas.setFont (inputnilaiTugas.getFont().deriveFont(16.0f));
        
        add(nilaiQuiz);
        nilaiQuiz.setBounds(30, 370, 200, 32);
        nilaiQuiz.setFont (nilaiQuiz.getFont().deriveFont(16.0f));
        add(inputnilaiQuiz);
        inputnilaiQuiz.setBounds(30, 400, 430, 32);
        inputnilaiQuiz.setFont (inputnilaiQuiz.getFont().deriveFont(16.0f));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
