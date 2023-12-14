<!-- quote_management.jsp -->
<%@ page import="java.util.List"%>
<%@ page import="Structure.Quotes"%>
<%@ page import="DAO.QuotesDAO"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="Connector.ConnectionProvider"%>
<%@ page import="Structure.Users"%>
<%
// Fetch all quotes from the database
QuotesDAO quotesDAO = new QuotesDAO(ConnectionProvider.getConnection());
List<Quotes> allQuotes = quotesDAO.getAllQuotes();
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Quote Management</title>
<!-- Bootstrap CSS -->

</head>
<body>
	<div class="container mt-5">
		<h2>Quote Management's</h2>

		<!-- Display all quotes -->
		<h3>All Quotes</h3>
		<table class="table">
			<thead>
				<tr>
					<th>The ID</th>
					<th>The Price</th>
					<th>Schedule Starter</th>
					<th>Note</th>
					<th>Status</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (Quotes quote : allQuotes) {
				%>
				<tr>
					<td><%=quote.getId()%></td>
					<td><%=quote.getPrice()%></td>
					<td><%=quote.getSchedulestart()%></td>
					<td><%=quote.getNote()%></td>
					<td><%=quote.getStatus()%></td>
					<td>
						<%-- Display action buttons only for pending quotes --%> <%
 if ("pending".equals(quote.getStatus())) {
 %>
						<form action="UpdateQuoteServlet.jsp" method="post">
							<input type="hidden" name="quoteId" value="<%=quote.getId()%>">
							<button type="submit" name="action" value="accept"
								class="btn btn-success">Accept</button>
							<button type="submit" name="action" value="reject"
								class="btn btn-danger">Reject</button>
						</form> <%
 } else {
 %> <span class="badge bg-info">Not Pending</span> <%
 }
 %>
					</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>

	<!-- Bootstrap JS and dependencies -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
