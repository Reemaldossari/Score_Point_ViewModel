package com.reemsd.score_point_viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelScore : ViewModel() {

    private var _scorePoint = MutableLiveData(0)
    val score: LiveData<Int>
        get() = _scorePoint

    // add one to the _scorePoint
    fun scoreOne() {
        _scorePoint.value = _scorePoint.value?.plus(1)

    }

    // add four to the _scorePoint
    fun scoreFour() {
        _scorePoint.value = _scorePoint.value?.plus(4)

    }

    //  minusTwo from _scorePoint
    fun minusTwo() {
        if (_scorePoint.value!! >= 2) _scorePoint.value = _scorePoint.value?.minus(2)
    }

}


