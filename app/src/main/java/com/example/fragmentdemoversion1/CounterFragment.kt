package com.example.fragmentdemoversion1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentdemoversion1.databinding.CounterFragmentBinding
import kotlinx.coroutines.flow.combineTransform

class CounterFragment : Fragment() {

    private lateinit var txtCounterDisplay: TextView
    private lateinit var btnIncrement: Button
    private lateinit var btnDecrement: Button

    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.counter_fragment, null)
        txtCounterDisplay = view.findViewById(R.id.txtCounterDisplay)
        btnIncrement = view.findViewById(R.id.btnIncrement)
        btnDecrement = view.findViewById(R.id.btnDecrement)

        btnIncrement.setOnClickListener {
            count++
            txtCounterDisplay.text = "$count"
        }

        btnDecrement.setOnClickListener {
            if (count > 0) {
                count--
                txtCounterDisplay.text = "$count"
            }
        }
        return view
    }
}