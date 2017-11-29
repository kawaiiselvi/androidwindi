package mycrud.cindi.project.id.siswawindi;

/**
 * Created by Administrator on 11/29/2017.
 */

public class konfigurasi {
    public static final String URL_ADD="http://192.168.1.9/Android/siswa/tambah.php";
    public static final String URL_GET_ALL = "http://192.168.1.9/Android/siswa/tampil.php";
    public static final String URL_GET_EMP = "http://192.168.1.9/Android/siswa/tampil1.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.1.9/Android/siswa/update.php";
    public static final String URL_DELETE_EMP = "http://192.168.1.9/Android/siswa/hapus.php?id=";


    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_KELAS = "kelas";
    public static final String KEY_EMP_NO_HP = "no_hp";
    public static final String KEY_EMP_ALAMAT = "alamat";
    public static final String KEY_EMP_CITA_CITA = "cita_cita";


    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_KELAS = "kelas";
    public static final String TAG_NO_HP = "no_hp";
    public static final String TAG_ALAMAT = "alamat";
    public static final String TAG_CITA_CITA = "cita_cita";


    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
