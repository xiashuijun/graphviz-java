/*
 * Copyright © 2015 Stefan Niederhauser (nidin@gmx.ch)
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
package guru.nidi.graphviz.engine;

class ProcessOptions {
    final int width;
    final int height;
    final double scale;
    final double fontAdjust;
    final double dpi;

    ProcessOptions() {
        this(0, 0, 1, 1, 72);
    }

    ProcessOptions(int width, int height, double scale, double fontAdjust, double dpi) {
        this.width = width;
        this.height = height;
        this.scale = scale;
        this.fontAdjust = fontAdjust;
        this.dpi = dpi;
    }

    ProcessOptions width(int width) {
        return new ProcessOptions(width, height, scale, fontAdjust, dpi);
    }

    ProcessOptions height(int height) {
        return new ProcessOptions(width, height, scale, fontAdjust, dpi);
    }

    ProcessOptions scale(double scale) {
        return new ProcessOptions(width, height, scale, fontAdjust, dpi);
    }

    ProcessOptions fontAdjust(double fontAdjust) {
        return new ProcessOptions(width, height, scale, fontAdjust, dpi);
    }

    ProcessOptions dpi(double dpi) {
        return new ProcessOptions(width, height, scale, fontAdjust, dpi);
    }
}
