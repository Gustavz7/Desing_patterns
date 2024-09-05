package estructural.facade;

import java.io.File;

import estructural.facade.mocklibs.AudioMixer;
import estructural.facade.mocklibs.BitrateReader;
import estructural.facade.mocklibs.CodecFactory;
import estructural.facade.mocklibs.VideoFile;
import estructural.facade.mocklibs.codec.Codec;
import estructural.facade.mocklibs.codec.MPEG4CompressionCodecImpl;
import estructural.facade.mocklibs.codec.OggCompressionCodecImpl;

public class VideoConversionFacade {
	public File convertVideo(String fileName, String format) {
		System.out.println("VideoConversionFacade: conversion started.");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(file);
		Codec destinationCodec;
		if (format.equals("mp4")) {
			destinationCodec = new MPEG4CompressionCodecImpl();
		} else {
			destinationCodec = new OggCompressionCodecImpl();
		}
		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediateResult);
		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}
}
