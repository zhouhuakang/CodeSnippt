	final static String FOLDER = "/sample/";
	final static String FILENAME = "log_aquarius";
	final static String SUFFIX = ".txt"; // suffix could be replaced on demand

	private void writeFile(StringBuilder sb) {
		String foldername = Environment.getExternalStorageDirectory().getPath() + FOLDER;
		File folder = new File(foldername);
		if (folder != null && !folder.exists()) {
			if (!folder.mkdir() && !folder.isDirectory()) {
				Log.d("Error", "Error: make dir failed!");
				return;
			}
		}

		String stringToWrite = sb.toString();
		String targetPath = foldername + FILENAME + SUFFIX;
		File targetFile = new File(targetPath);
		if (targetFile != null) {
			if (targetFile.exists()) {
				targetFile.delete();
			}

			OutputStreamWriter osw;
			try {
				osw = new OutputStreamWriter(new FileOutputStream(targetFile), "utf-8");
				try {
					osw.write(stringToWrite);
					osw.flush();
					osw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}