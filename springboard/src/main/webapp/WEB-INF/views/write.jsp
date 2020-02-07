<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글쓰기</title> 
		<link rel="stylesheet" href="./css/style.css" />
	</head>
	<body>
		<div id="board">
			<h3>글쓰기</h3>
			<div class="write">
				<form action="/springboard/write" method="post">
					<table>
						<tr>
							<td>제목</td>
							<td><input type="text" name="subject" value="제목입니다" required /></td>
						</tr>				
						<tr>
							<td>내용</td>
							<td>
								<textarea name="content" rows="20" required>내용입니다</textarea>
							</td>
						</tr>
						<tr>
							<td>첨부</td>
							<td>
								<input type="file" name="file" />
							</td>
						</tr>
					</table>
					<div class="btns">
						<a href="#" class="cancel">취소</a>
						<input type="submit" class="submit" value="보내기" />
					</div>
				</form>
			</div>
		</div>
	</body>
</html>


