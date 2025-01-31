/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
 * Copyright (c) 2022 LukeGrahamLandry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.fabric.api.client.item.v1;

import ca.lukegrahamlandry.forgedfabric.events.ClientHelper;
import net.fabricmc.fabric.api.event.Event;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.List;

public interface ItemTooltipCallback {
    Event<ItemTooltipCallback> EVENT = new ClientHelper.TooltipEvent();

    void getTooltip(ItemStack stack, TooltipContext context, List<Text> lines);

}
