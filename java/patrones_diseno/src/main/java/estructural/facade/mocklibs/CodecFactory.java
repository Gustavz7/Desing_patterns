package estructural.facade.mocklibs;

import estructural.facade.mocklibs.codec.Codec;
import estructural.facade.mocklibs.codec.MPEG4CompressionCodecImpl;
import estructural.facade.mocklibs.codec.OggCompressionCodecImpl;

public class CodecFactory {
	public static Codec extract(VideoFile file) {
		String type = file.getCodecType();
		if (type.equals("mp4")) {
			System.out.println("CodecFactory: extracting mpeg audio...");
			return new MPEG4CompressionCodecImpl();
		} else {
			System.out.println("CodecFactory: extracting ogg audio...");
			return new OggCompressionCodecImpl();
		}
	}
}
