package com.hehandong.wanandroidjetpack.adapter

import android.text.TextUtils
import android.view.View
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.hehandong.wanandroidjetpack.R

/**
 *
 * @Author dong
 * @Date 2019-10-18 17:55
 * @Description TODO
 * GitHub：https://github.com/hehandong
 * Email：hehandong@qq.com
 * @Version 1.0
 */

//class HomeAdapter : BaseQuickAdapter<ArticleBean, BaseViewHolder>(R.layout.item_home2, null) {
//
//    override fun convert(helper: BaseViewHolder, item: ArticleBean?) {
//        if (item != null) {
//            helper.setText(R.id.tv_type, item!!.getChapterName())
//            helper.setText(R.id.tv_title, item!!.getTitle())
//            val contentTv = helper.getView(R.id.tv_content)
//            //item.getDesc()如果包含标记符<p>，显示出来不好看
//            if (TextUtils.isEmpty(item!!.getDesc()) || item!!.getDesc().contains("<p>")) {
//                contentTv.setVisibility(View.GONE)
//            } else {
//                contentTv.setVisibility(View.VISIBLE)
//                contentTv.setText(item!!.getDesc())
//            }
//
//            helper.setText(R.id.tv_date, item!!.getNiceDate())
//            val author = App.getInstance().getString(R.string.author) + item!!.getAuthor()
//            helper.setText(R.id.tv_author, author)
//
//        }
//    }
//
//}