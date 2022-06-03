package com.example.fragmentbestpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class NewsContentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_content_frag, container, false)
    }

    fun refresh(title: String, content: String) {
        val contentLayout:LinearLayout? = activity?.findViewById(R.id.contentLayout)
        contentLayout?.visibility = View.VISIBLE
        val newsTitle: TextView? = activity?.findViewById(R.id. newsTitleAboveContent)
        val newsContent:TextView? = activity?.findViewById(R.id.newsContent)
        newsTitle?.text = title   // 刷新新闻的标题
        newsContent?.text = content    // 刷新新闻的内容
    }
}

