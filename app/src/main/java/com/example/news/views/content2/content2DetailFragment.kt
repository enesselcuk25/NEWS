package com.example.news.views.content2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.news.R
import com.example.news.databinding.*
import com.example.news.userDataModel.contentModel.content1detail.Content1Data
import com.example.news.userDataModel.contentModel.content1detail.Content1dataImage


class content2DetailFragment : Fragment() {

    private  lateinit var binding: FragmentContent2Detail2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContent2Detail2Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.contentAbout2DetailImage = Content1dataImage(R.drawable.conten2image2)
        binding.contentAbout2DetailText = Content1Data("İyi bir online derste olması gereken 5 özellik",
        "Uzun vadeli bir başarı için online eğitimde çocukları nasıl motive ederiz?","Okul eğitimi hızla dijitale dönüşmeye devam ediyor. Ancak, online derslerle ilgili tüm kartlar ebeveynlerin elinde. Önemli olan doğru formatı seçmek ve çocuğunuzun yeni formatta öğrenmesini motive etmektir.\n" +
                    "\n" +
                    "\n" +
                    "Peki, çocuğu online eğitime motive ederken dikkat edilmesi gerekenler nelerdir?\n" +
                    "\n" +
                    "\n" +
                    "2020'de, online eğitim sektöründe rekor bir büyüme gerçekleşti. Talep 2,5 kat arttı. Ebeveynler, asla erişme imkanı bulamayacakları uluslararası eğitmenlik sertifikalı uzmanlarla yüz yüze çalışma fırsatına sahip oldular. Ancak kendimize şu soruyu sorduk: Çocuklar online derslere ne kadar hazır?\n" +
                    "\n" +
                    "\n" +
                    "Son bir yılda karantinada olan ve uzaktan eğitim gören birçok çocukta online okullaşma deneyiminin başarılı olduğu söylenemez. Bu durum ebeveynlerde çeşitli sorulara neden oluyor. O sorulardan biri ise \"İyi bir online ders için kriterler nelerdir?\".\n" +
                    "\n" +
                    "\n" +
                    "İşte online derslerin nitelikli olduğunu gösteren 5 işaret:\n" +
                    "\n" +
                    "\n" +
                    "1- Yeni nesil öğretmen - duygusal zeka ustası\n" +
                    "\n" +
                    "Hem mesleki hem de duygusal yeterlilik, online bir öğretmen için eşit derecede önemli. Dijital ortamda, öğretmenin öğrenciyi etkilemek için daha az seçeneği bulunuyor. Duyu yoksunluğu koşullarında öğrenci ile aynı düzlemde hissetmek önemlidir. Duygusal zeka ve yüksek empati düzeyi, öğretmenin istenen ruh halini yaymasına ve çocuğun öğrenme esnasında verdiği sözel olmayan sinyallere karşı artan duyarlılığa sahip olmasına izin verir.\n" +
                    "\n" +
                    "\n" +
                    "Genellikle öğretmenlerin nasıl ders verdiğini gözlemlemek için deneme dersleri bulunuyor. Deneme derslerini çocuğunuzla birlikte almayı atlamayın. Hem çocuğunuzun tepkilerini hem de öğretmeni değerlendirin. Online eğitimde bu kritiktir ve öğretmen çocuğun dikkatini toplamanın anahtarını bulamazsa hiçbir diploma çocuğunuzun başarılı olmasına katkı sağlamayacaktır.\n" +
                    "\n" +
                    "\n" +
                    "2- Online ders 25 dakikadan fazla olmamalı\n" +
                    "\n" +
                    "Uzun online dersler etkisizdir. Psikoloji profesörü ve Los Angeles'ta Study Less, Study Smart'ın kurucusu Marty Lobdell, yetişkin öğrencilerin bile 30 dakikalık çalışmadan sonra konsantrasyonlarını kaybettiğini ve dikkatlerinin yavaş yavaş dağılmaya başladığını söylüyor. Microsoft’un \"insan beyninin yeniden yapılandırılması\" üzerine araştırması ise sürekli bilgi gürültüsü ve artan çoklu görevler nedeniyle, kişinin ortalama dikkat süresinin yıldan yıla azaldığını gösteriyor.\n" +
                    "\n" +
                    "\n" +
                    "Günümüzde çocukların ortalama konsantrasyon süreleri:\n" +
                    "\n" +
                    "6 yaş - 21 dakika\n" +
                    "\n" +
                    "7 yaş - 23 dakika\n" +
                    "\n" +
                    "8 yaş - 28 dakika\n" +
                    "\n" +
                    "\n" +
                    "Bu yüzden online ders süresini uzatmak tavsiye edilmiyor. Çocuk rahatsız olursa iletişim halinde olmayı sürdüremeyecek ve bilgiyi kalıcı bir şekilde algılayamayacaktır.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "3- Oyunlaştırma\n" +
                    "\n" +
                    "Oyunlaştırma, dikkati kolayca dağılan bir çocuğun dikkatini tekrar çekme yöntemlerinden biridir ve bugün online eğitimde kullanılan önemli bir yöntemdir. Oyunlaştırma yönteminin özü, çocuğun yeni bilgileri aşina olduğu oyun formatıyla öğrenmesidir. Ve burada imkanlar sınırsız diyebiliriz. Örneğin sanal gerçeklik ile ana dili İngilizce olan bir konuşmacı eşliğinde Londra’da gezebiliyorsunuz ya da \"Yüzüklerin Efendisi\" filminde aksiyonların gerçekleştiği yerlerden biri olan Hobbit köyünde bir gezinti yapabiliyorsunuz. Çocuğun sanal tur sırasında, sürece katılımı maksimum düzeydedir. Etrafına iyice bakabilir, yeni şeyler öğrenebilir ve bu süreçte izlenimlerini öğretmenle paylaşabilir. Eğitim sürecini oyuna ve eğlenceli bir sürece dönüştürmek, özellikle dil eğitimi olmak üzere herhangi bir online etkinliğin güçlü bir öğesidir.\n" +
                    "\n" +
                    "\n" +
                    "Okullarda kullanılan, sadece konuşan öğretmen formatından yorulup kendini soyutlayan öğrencilerin ebeveynleri, onları bu gibi yöntemlere yönelterek çocuklarının başarılı olmalarını sağlıyorlar.\n" +
                    "\n" +
                    "\n" +
                    "4- Amaç varsa engel yoktur\n" +
                    "\n" +
                    "Büyük çocukların öğrenmesi için amaç ile güçlendirilmiş gerçek motivasyona ihtiyaçları vardır. Hedefi görmediklerinde yeni bir şeyler öğrenmeleri zordur. Bu nedenle, ilk adım çalışmaya bir değer ve anlam kazandırmaktır. Diyelim ki çocuğunuz idolü ile ana dilinde iletişim kurmak, orijinal dilinde bir film izlemek ya da Google Translate kullanmadan en sevdiği müzik grubunun yaratıcılığını anlamak istiyor. Bu durumda adım adım nihai hedefi takip etmek daha kolaydır.\n" +
                    "\n" +
                    "\n" +
                    "5- Geri kalmış hissetmemek\n" +
                    "\n" +
                    "Online dersler hem grup halinde hem de bireysel olarak yapılabilir. Ebeveyn için başlangıçta hangi formatın çocuğuna uygun olduğunu değerlendirmek önemlidir. Herkese uyan tek bir çözüm yoktur. Oyunlu derslerden keyif alan sosyal çocuklar ya da tam aksine kendine uygun bir hızla tek başına pratik yapmayı tercih edenler vardır. Bireysel derslerde boşluklar bulması, çalışması ve bilgiyi pekiştirip kaldığı yerden devam etmesi daha kolaydır. Daha da önemlisi geri kalma korkusu hissettirmez.")

    }

}