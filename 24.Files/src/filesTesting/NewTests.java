package filesTesting;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Arrays;

public class NewTests {
	public static void main(String[] args) throws IOException {
		File reading = new File("read.txt");
		if (!reading.exists()) {
			try {
				reading.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String text = "To the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religion.To the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religionTo the men who fought against the rising truths of physical philosophy, it seemed that if they admitted that truth it would destroy faith in God, in the creation of the firmament, and in the miracle of Joshua the son of Nun. To the defenders of the laws of Copernicus and Newton, to Voltaire for example, it seemed that the laws of astronomy destroyed religion, and he utilized the law of gravitation as a weapon against religion";
		try (PrintWriter add = new PrintWriter(reading);) {
			add.write(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		long start = System.currentTimeMillis();
		try (InputStream input = new BufferedInputStream(new FileInputStream(reading));){
			
//			int b = input.read();

//			while (b != -1) {
//				System.out.print((char) b);
//				b = input.read();
//			}
			byte[] letters = new byte[(int) reading.length()];
			input.read(letters);
			System.out.println(new String(letters));
			System.out.println(System.currentTimeMillis() - start);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
