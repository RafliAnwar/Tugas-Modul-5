
package tugasmodul5_kel34;

public class userService34 {//deklarasi
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][4];
    private String email, password, roles = "";
    private String emailh,mapel,mapel1,date;
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService34(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"Dzulkelompok34@gmail.com", "12345", "supedAdmin"},
            {"Litakelompok34@gmail.com", "12345", "user"} 
        };
        String[][] histories = 
        { 
            {"Dzulkelompok34@gmail.com", "Fisika Dasar","Dasar Komputer dan Pemrograman", "22-04-2020"},
            {"Litakelompok34@gmail.com", "Dasar Komputer dan Pemrograman","Konsep Jaringan Komputer", "22-04-2020"} 
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()//pengecekan data pada array di constructor userService34
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {   
                if(data[i][1].equals(password))
                {   //variabel berisi data dari array pada constructor 
                    emailh = histories[i][0];
                    mapel = histories[i][1];
                    mapel1= histories[i][2];
                    date = histories [i][3];
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()//proses login dengan mengambil boolean dari chechCredential sebagai kondisi penentu dalam pengkondisian pada method ini
    {
        boolean status = checkCredential();
        if(status == true)//jika benar akan ditampilkan output seperti dibawah
        {//output
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + emailh);
            System.out.println(mapel);
            System.out.println(mapel1);
            System.out.println("Tanggal Pinjaman : " + date);
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}