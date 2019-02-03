package by_epam_under_guidance_of_blinnov_task1;

import java.io.File;

import impl.Validation;

public class ValidationFile implements Validation{

	@Override
	public Boolean checkFile(File file) {
		return file.exists()  && file.canRead();

	}
}
