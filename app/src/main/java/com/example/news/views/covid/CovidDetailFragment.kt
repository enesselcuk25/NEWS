package com.example.news.views.covid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.news.R
import com.example.news.databinding.FragmentCardBinding
import com.example.news.databinding.FragmentCovidDetailBinding
import com.example.news.userDataModel.covid.*

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class CovidDetailFragment : Fragment() {


    private  lateinit var binding: FragmentCovidDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCovidDetailBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listAddImage()

        binding.detailText = DetailCovidText("Koranavirüs")
        binding.detailImage = DetailCovidImage(R.drawable.covidimagedetail)

        binding.detailHealtText = DeCovidHealtText("Sağlık bilgileri","Dünya Sağlık Örgütü (DSÖ) ve diğer kuruluşların koronavirüse (COVID-19) karşı korunma, hastalığın semptomları ve tedavisiyle ilgili verdikleri son bilgileri öğrenin")
        binding.detailHealtImage = DeCovidHealtImage(R.drawable.covid_book)




    }
private fun listAddImage(){
    binding.carousel.registerLifecycle(lifecycle)

    val list = mutableListOf<CarouselItem>()
    list.add(
        CarouselItem(
            imageDrawable = R.drawable.covidimage1,
            caption = "Yerli aşı açıklanması : Ekim de seri üretime geçebiliriz"

        )
    )

    list.add(
        CarouselItem(
            imageDrawable = R.drawable.covidimage2,
            caption = "Bilim kurulu üyesinden korana açıklaması: Hız kesse de devam edecek"
        )
    )
    list.add(
        CarouselItem(
            imageDrawable = R.drawable.conten2image3,
            caption = "PCR testleri iki katına çıktı"
        )
    )
    list.add(
        CarouselItem(
            imageDrawable = R.drawable.conten2image4,
            caption = "Uygulanan covid-19 aşı dozu sayısı 100 milyonu geçti "
        )
    )
    list.add(
        CarouselItem(
            imageDrawable = R.drawable.conten2image5,
            caption = "PROf.DR.Aydın şartı açıkladı! Toplumsal bağışıklığa ulaşmak 1 ayda mümkün "
        )
    )
    list.add(
        CarouselItem(
            imageDrawable = R.drawable.conten2image6,
            caption = "Korkutan açıklama! hastaneler yeniden doluyo "
        )
    )
    list.add(
        CarouselItem(
            imageDrawable = R.drawable.conten2image7,
            caption = "MU Varyantından korunmanın en etkili yolunu açıkladı"
        )
    )

    binding.carousel.setData(list)
}



}