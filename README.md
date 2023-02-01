row = untuk membuat baris

col = untuk membuat kolom

space = untuk membuat spasi

Membuat Pola Bintang Angka 1 5 dan Huruf Y

Notes: Pola awal bentuk bintang berbentuk persegi (5 baris & 5 kolom) tapi dimodifikasi menggunakan if else

Langkah-Langkah:

1. Memilih banyak baris (row); 
2. For pertama digunakan untuk membuat baris sehingga saya memasukkan nilai (row) = 1, kemudian (row) lebih kecil sama dengan 5, dan (row)++
sehingga akan membuat batasan bintang hanya bisa di print 5x kebawah;
3. Pertama, untuk membuat angka 1 saya menggunakan for di dalam for pertama dimana saya memasukkan nilai (col) = 1, (col) lebih kecil sama dengan 1, dan (col)++ 
dengan perintah System.out.print("*"); maka akan mencetak bintang sebanyak 1 kolom (1x kekanan) karena nilai (col) lebih kecil sama dengan 1, 
kemudian karena nilai (row) pada for pertama lebih kecil sama dengan 5 maka bintang akan dicetak sebanyak 5 baris (5x ke bawah);
4. Kemudian untuk membuat spasi saya menggunakan for lagi (masih berada di dalam for partama) dengan memasukkan nilai (space) = 1, (space) lebih kecil sama dengan 2, 
(space)++ dengan perintah System.out.print(" "); sehingga akan membuat spasi sebanyak 2 kolom (2x ke kanan) karena nilai (space) lebih kecil sama dengan 2, 
kemudan karena nilai (row) pada for pertama lebih kecil sama dengan 5 maka akan membuat spasi sebanyak 5 baris (5x ke bawah);
5. Kedua, untuk membuat angka 5 saya menggunakan for lagi (masih berada di dalam for pertama) dimana saya memasukkan nilai (col) = 1, (col) lebih kecil sama dengan 5, 
dan (col)++ kemudian menggunakan if dimana (row==1) atau ((row==3 || row==5) && (col<=4)) atau (row==2 && (col==1)) atau (row==4 && (col==5)) 
dengan perintah System.out.print("*"); sehingga akan mencetak bintang hanya pada baris pertama sebanyak 5 kolom (5x ke kanan), baris ketiga dan 
lima sebanyak 4 kolom (4x ke kanan) karena syaratnya (col) lebih kecil sama dengan 4, baris kedua pada kolom ke-1 karena syarat (col==1), baris keempat pada kolom 
ke-5 karena syarat (col==5), lalu menggunakan else dengan perintah System.out.print(" "); sehingga menghilangkan kolom yang tidak mengikuti syarat if;
6. Kemudian saya mengulangi langkah ke5 untuk membuat spasi untuk memberi jarak;
7. Ketiga, untuk membuat huruf Y saya menggunakan for lagi (masih berada di dalam for pertama) dimana saya memasukkan nilai (col) = 1, (col) lebih kecil sama dengan 5, 
dan (col)++ kemudian menggunakan if dimana (row==1 && (col==1 || col==5)) atau (row==2 && (col==2 || col==4)) atau (row>=3 && (col==3)) dengan perintah 
System.out.print("*"); sehingga akan mencetak bintang hanya pada baris pertama kolom ke-1 dan ke-5 karena syarat (col==1) || (col==5), 
baris kedua kolom ke-2 dan ke-4 karena syarat (col==2) || (col==4), baris ketiga hingga kelima pada kolom ke-3 karena syarat jika (row) lebih besar sama dengan 3 dan (col) sama dengan 3 
maka akan mencetak bintang, lalu menggunakan else dengan perintah System.out.print(" "); sehingga menghilangkan kolom yang tidak mengikuti syarat if;
8. Terakhir, mengisi for pertama perintah System.out.println(" "); agar jika nilai (row) salah maka akan melanjutkan kebaris berikutnya.
