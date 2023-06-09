package com.githubexplorer.features.projectlist.ui.adapter

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.githubexplorer.features.projectlist.domain.model.ProjectItem
import com.githubexplorer.features.projectlist.ui.viewholder.ProjectItemViewHolder

class ProjectListPagingAdapter :
    PagingDataAdapter<ProjectItem, ProjectItemViewHolder>(ProjectItemDiff()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectItemViewHolder {
        return ProjectItemViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ProjectItemViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bind(it)
        }
    }

    private class ProjectItemDiff : DiffUtil.ItemCallback<ProjectItem>() {

        override fun areItemsTheSame(oldItem: ProjectItem, newItem: ProjectItem): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ProjectItem, newItem: ProjectItem): Boolean {
            return oldItem == newItem
        }
    }
}