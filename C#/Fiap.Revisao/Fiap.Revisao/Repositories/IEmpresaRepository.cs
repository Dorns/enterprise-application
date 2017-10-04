using Fiap.Revisao.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fiap.Revisao.Repositories
{
    public interface IEmpresaRepository
    {
        void Cadastrar(Empresa empresa);
        List<Empresa> Listar();
    }
}
