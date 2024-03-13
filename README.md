> #### Winoto Hasyim - 2206025243 - Pemrograman Lanjut B
## Module 5 - Pemrograman Lanjut 2023/2024 Genap

Screenshots of the performance testing with JMETER:

### `/all-student`:
![Screenshots of all-student Test Plan](https://imgur.com/mKZnLFs.png)

### `/all-student-name`:
![Screenshots of all-student-name Test Plan](https://imgur.com/BYgWmuh.png)

### `/highest-gpa`:
![Screenshots of highest-gpa Test Plan](https://imgur.com/cAhW4ab.png)

Screenshots of the performance testing with CLI:

### `/all-student`:
![Screenshots of all-student Test Plan](https://imgur.com/Xy3jeNw.png)

### `/all-student-name`:
![Screenshots of all-student-name Test Plan](https://imgur.com/Gf09l1p.png)

### `/highest-gpa`:
![Screenshots of highest-gpa Test Plan](https://imgur.com/VOhOsVK.png)

### Conclusion
Setelah melakukan performance optimization process, bisa diketahui bahwa processing time dari method bisa menjadi lebih cepat. Berikut adalah hasil performance test menggunakan JMeter:

### `/all-student`:
![all-student-request in Table screenshot](https://imgur.com/5eHvYud.png)

### `/all-student-name`:
![all-student-name-request in Table screenshot](https://imgur.com/sbcpY1y.png)

### `/highest-gpa`:
![highest-gpa in Table screenshot](https://imgur.com/et1OUFR.png)

## Reflection

#### 1. *What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?*

- JMeter digunakan untuk memeriksa sejauh mana suatu aplikasi dapat menangani beban kerja dengan mensimulasikan banyak pengguna yang mengakses aplikasi secara bersamaan

- Intellij Profiler adalah suatu alat yang dapat membantu mengidentifikasi bagian-bagian sistem yang menimbulkan masalah performance secara detail seperti menampilkan CPU usage, memory allocation, identifikasi kode yang inefisien, dan lain-lain.

#### 2. *How does the profiling process help you in identifying and understanding the weak points in your application?*

Profiling bisa mengidentifikasi weak points dengan:
- Mengidentifikasi performance bottlenecks: Profiling dapat mengidentifikasi bagian kode yang mana yang memakan banyak waktu untuk dieksekusi dengan menampilkan CPU time dari pengeksekusian kode. Selain itu profiling juga dapat dipakai untuk mengidentifikasi kode mana yang memakai resource yang paling banyak. Setelah diidentifikasi, kita bisa melakukan optimisasi pada kode tersebut.
- Menampilkan bagaimana aplikasi kita memakai memori. Hal ini bisa membantu dalam mengidentifikasi memory leaks atau pemakaian memory yang berlebihan

#### 3. *Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?*

Menurut saya, Intellij Profiler lumayan efektif untuk mengalisis dan mengidentifikasi bottleneck karena Intellij Profiler mampu memberikan data secara real-time sehingga kita bisa memantau kinerja aplikasi saat berjalan. Tidak hanya itu, dengan profiler tersebut, kita juga bisa melihat penggunaan memori, CPU Time, dan informasi lainnya untuk setiap tahap eksekusi pada sebuah aplikasi, sehingga kita bisa mem-pinpoint performance issues dan kemudian mengoptimisasi kode kita

#### 4. *What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?*

Challenge yang saya hadapi ketika melakukan performance testing adalah tentang bagaimana caranya menginterpretasi hasil testing dan profiling karena hasil/outputnya terlalu detail dan term-term yang dipakai pada hasil tersebut terlihat asing bagi saya. Selain itu, saya juga sulit mengidentifikasi masalah apa yang muncul dalam aplikasi saya. Solusi dari challenge tersebut yaitu dengan memahami term-term yang dipakai pada performance testing dan profiling dengan searching-searching di google. Untuk hasil yang terlalu detail dan challenge pengidentifikasian masalah, saya hanya tinggal fokus pada issue pada kode yang saya pikir dapat diatasi sehingga meningkatkan performance aplikasi secara signifikan. Selain itu, kalau saya ingin mengecek performa suatu detail secara sepsifik, tinggal melakukan search pada profiling.

#### 5. *What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?*

Main benefits dari penggunaan IntelliJ Profiler, selain dari yang sudah saya sebut pada [refleksi nomor 2](#2-how-does-the-profiling-process-help-you-in-identifying-and-understanding-the-weak-points-in-your-application), adalah kita tidak perlu menggunakan aplikasi lagi diluar IDE kita untuk melakukan profiler karena Profiler sudah terintegrasi dengan Intellij. Selain itu, kita bisa melakukan monitoring terhadap aplikasi kita secara real-time sehingga kita bisa mengidentifikasi issue yang muncul selama aplikasi berjalan.

#### 6. *How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?*

Sejauh ini, saya belum pernah mengalami kasus dimana hasil dari Intellij Profiler tidak sepenuhnya konsisten dengan hasil dari JMeter. Tetapi jika kasus tersebut muncul, pertama-tama saya akan mengecek apakah konfigurasi pada Profiler dan JMeter benar atau tidak. Kemudian saya akan mengecek faktor eksternal seperti kondisi jaringan atau hardware saya. Jika masalah belum terselesaikan, saya akan mencoba berkonsultasi dengan dosen, asdos, atau teman saya.

#### 7. *What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?*

- Mengidentifikasi bagian kode yang tidak efisien dalam pengeksekusiannya seperti dalam hal execution time, memory usage, dan lain-lain.
- Refaktor kode seperti mengganti algoritma, memperbaiki struktur data, mengurangi redundansi, dan lain-lain.
- Melakukan testing dan profiling lagi untuk pengujian beban dan pemantauan kinerja aplikasi. Dengan ini kita bisa melihat apakah kinerja aplikasi kita sudah optimal atau belum

Untuk memastikan bahwa perubahan kode tidak berpengaruh pada fungsionalitas aplikasi, mungkin kita bisa melakukan unit testing pada setiap bagian kode yang diubah untuk memastikan bahwa mereka masih berfungsi seperti yang diharapkan. Selain itu, kita juga bisa melakukan integration dan functional test juga pada aplikasi kita untuk mengecek apakah perubahan kode tersebut berpengaruh pada fungsionalitas aplikasi.


