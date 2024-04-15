package com.jepf.mvvm.viewModel

import android.text.style.QuoteSpan
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jepf.mvvm.model.QuoteModel
import com.jepf.mvvm.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun ramdonQuote(){
        val currentQuoter = QuoteProvider.ramdon()
        quoteModel.postValue(currentQuoter)
    }

}