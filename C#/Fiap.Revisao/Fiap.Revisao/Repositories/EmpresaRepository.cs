using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Fiap.Revisao.Models;
using Fiap.Revisao.Persistencia;

namespace Fiap.Revisao.Repositories
{
    public class EmpresaRepository : IEmpresaRepository
    {
        private EmpresarialContext _context;

        public EmpresaRepository(EmpresarialContext context)
        {
            _context = context;
        }
        public void Cadastrar(Empresa empresa)
        {
            _context.Empresas.Add(empresa);
        }

        public List<Empresa> Listar()
        {
            return _context.Empresas.ToList();
        }
    }
}