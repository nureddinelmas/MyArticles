package com.nureddinelmas.myarticles.data.models

import androidx.compose.ui.graphics.Color
import com.nureddinelmas.myarticles.ui.theme.HighPriorityColor
import com.nureddinelmas.myarticles.ui.theme.LowPriorityColor
import com.nureddinelmas.myarticles.ui.theme.MediumPriorityColor
import com.nureddinelmas.myarticles.ui.theme.NonePriorityColor


enum class Priority (val color: Color) {
	HIGH(HighPriorityColor),
	MEDIUM(MediumPriorityColor),
	LOW(LowPriorityColor),
	NONE(NonePriorityColor)
}