
package estructural.facade.mocklibs;

import estructural.facade.mocklibs.codec.Codec;

public class BitrateReader {
	public static VideoFile read(VideoFile file, Codec codec) {
		System.out.println("BitrateReader: reading file...");
		return file;
	}

	public static VideoFile convert(VideoFile buffer, Codec codec) {
		System.out.println("BitrateReader: writing file...");
		return buffer;
	}
}
