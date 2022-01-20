package com.reemsd.score_point_viewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.reemsd.score_point_viewmodel.databinding.FragmentScoreBinding


class ScoreFragment : Fragment() {

    var binding: FragmentScoreBinding? = null


    private val viewModel: ViewModelScore by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //binding = FragmentScoreBinding.inflate(inflater, container, false)
        binding = FragmentScoreBinding.inflate(inflater,container,false)

        return binding?.root

    }

    override
    fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnAdd1?.setOnClickListener {
            viewModel.scoreOne()
        }


        binding?.btnAdd4?.setOnClickListener {
            viewModel.scoreFour()
        }

        binding?.btnMinus2?.setOnClickListener {
            viewModel.minusTwo()
        }


        viewModel.score.observe(viewLifecycleOwner, { score ->
            binding?.txtScore?.text = score.toString()
        })


        fun onDestroy() {
            super.onDestroy()
            binding = null
        }


    }
}