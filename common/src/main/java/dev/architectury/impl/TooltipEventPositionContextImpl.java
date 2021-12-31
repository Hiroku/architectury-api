/*
 * This file is part of architectury.
 * Copyright (C) 2020, 2021, 2022 architectury
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package dev.architectury.impl;

import dev.architectury.event.events.client.ClientTooltipEvent;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public class TooltipEventPositionContextImpl implements ClientTooltipEvent.PositionContext {
    private int tooltipX;
    private int tooltipY;
    
    public TooltipEventPositionContextImpl reset(int tooltipX, int tooltipY) {
        this.tooltipX = tooltipX;
        this.tooltipY = tooltipY;
        
        return this;
    }
    
    @Override
    public int getTooltipX() {
        return tooltipX;
    }
    
    @Override
    public void setTooltipX(int x) {
        this.tooltipX = x;
    }
    
    @Override
    public int getTooltipY() {
        return tooltipY;
    }
    
    @Override
    public void setTooltipY(int y) {
        this.tooltipY = y;
    }
}
