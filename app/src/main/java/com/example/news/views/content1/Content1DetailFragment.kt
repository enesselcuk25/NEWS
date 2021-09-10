package com.example.news.views.content1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.news.R
import com.example.news.databinding.FragmentContent1DetailBinding
import com.example.news.userDataModel.contentModel.content2detail.ContentDataDetail
import com.example.news.userDataModel.contentModel.content2detail.ContentDetailImage


class Content1DetailFragment : Fragment() {
    private  lateinit var binding: FragmentContent1DetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContent1DetailBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.aboutText = ContentDataDetail("Milli motosikletçi Deniz Öncü İspanya’da piste çıkacak",
        "Milli motosikletçi Deniz Öncü, hafta sonu İspanya’da kupa mücadelesi verecek.",
        "Türkiye Motosiklet Federasyonu'ndan (TMF) yapılan açıklamaya göre Dünya Moto3 Şampiyonası’nda Türkiye'yi temsil eden, Barselona ve Avusturya’da kürsüye çıkan milli sporcu Deniz Öncü (Red Bull KTM Tech3) 10-12 Eylül tarihlerinde FIM Moto3 Dünya Şampiyonası’nın 13. ayağında piste çıkacak.\n" +
                "\n" +
                "Uluslararası Motosiklet Federasyonu (FIM) tarafından organize edilen Moto3 Dünya Şampiyonası yarışları 5,1 km uzunluğa sahip Motorland Aragon pistinde düzenlenecek.\n" +
                "\n" +
                "TMF Milli Takımlar Kaptanı Kenan Sofuoğlu koordinesinde Moto3 sınıfında mücadele eden Deniz Öncü, yarınki sıralamalara yarışlarının ardından 12 Eylül Pazar günü TSİ 12.00’de start alacak yarışta mücadele edecek.")

        binding.aboutImage = ContentDetailImage(R.drawable.content2image)

    }
}