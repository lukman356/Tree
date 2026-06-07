public class TreeArray13 {

    Mahasiswa13[] dataMahasiswa;
    int idxLast;

    public TreeArray13() {
        dataMahasiswa = new Mahasiswa13[10];
    }

    void populateData(Mahasiswa13[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {

                traverseInOrder(2 * idxStart + 1);

                dataMahasiswa[idxStart].tampilInformasi();

                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}