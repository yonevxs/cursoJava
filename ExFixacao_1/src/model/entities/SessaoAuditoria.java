package model.entities;

public class SessaoAuditoria implements AutoCloseable {
	
	@Override
	public void close() {
		System.out.println("[AUDITORIA] Sessão encerrada com sucesso!");
	}
}
