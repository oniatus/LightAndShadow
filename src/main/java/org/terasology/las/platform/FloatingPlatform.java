/*
 * Copyright 2015 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.las.platform;

import org.terasology.math.geom.Rect2i;

/**
 *
 */
public class FloatingPlatform {

    private Rect2i area;
    private int baseHeight;

    public FloatingPlatform(Rect2i area, int baseHeight) {
        this.area = area;
        this.baseHeight = baseHeight;
    }

    public Rect2i getArea() {
        return area;
    }

    public int getBaseHeight() {
        return baseHeight;
    }


}
